package com.timsu.astrid.activities;

import java.util.Random;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;

import com.timsu.astrid.R;
import com.timsu.astrid.utilities.Constants;
import com.timsu.astrid.utilities.Notifications;
import com.timsu.astrid.widget.NumberPicker;
import com.timsu.astrid.widget.NumberPickerDialog;
import com.timsu.astrid.widget.NumberPickerDialog.OnNumberPickedListener;

public class TaskViewNotifier extends TaskView {

    // bundle tokens
    public static final String FROM_NOTIFICATION_TOKEN = "notify";
    public static final String NOTIF_FLAGS_TOKEN       = "notif_flags";
    public static final String NOTIF_REPEAT_TOKEN      = "notif_repeat";

    // properties of the alarm that was triggered
    private long repeatInterval = 0;
    private int  flags = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle extras = getIntent().getExtras();
        if(extras != null && extras.containsKey(FROM_NOTIFICATION_TOKEN)) {
            if(extras.containsKey(NOTIF_REPEAT_TOKEN))
                repeatInterval = extras.getLong(NOTIF_REPEAT_TOKEN);
            if(extras.containsKey(NOTIF_FLAGS_TOKEN))
                flags = extras.getInt(NOTIF_FLAGS_TOKEN);
            showNotificationAlert();
        }
    }

    /** Called when user clicks on a notification to get here */
    private void showNotificationAlert() {
        Resources r = getResources();

        // clear notifications
        Notifications.clearAllNotifications(this, model.getTaskIdentifier());

        String[] responses = r.getStringArray(R.array.reminder_responses);
        String response = responses[new Random().nextInt(responses.length)];
        new AlertDialog.Builder(this)
        .setTitle(R.string.taskView_notifyTitle)
        .setMessage(response)
        .setIcon(android.R.drawable.ic_dialog_alert)

        // yes, i will do it: just closes this dialog
        .setPositiveButton(R.string.notify_yes, null)

        // no, i will ignore: quits application
        .setNegativeButton(R.string.notify_no, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                setResult(Constants.RESULT_GO_HOME);
                TaskList.shouldCloseInstance = true;
                finish();
            }
        })

        // snooze: sets a new temporary alert, closes application
        .setNeutralButton(R.string.notify_snooze, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                snoozeAlert();
            }
        })

        .show();
    }

    private void snoozeAlert() {
        Resources r = getResources();
        // ask how long
        new NumberPickerDialog(this,
                new OnNumberPickedListener() {
            @Override
            public void onNumberPicked(NumberPicker view, int number) {
                Notifications.createSnoozeAlarm(TaskViewNotifier.this,
                        model.getTaskIdentifier(), number * 60, flags,
                        repeatInterval);

                setResult(Constants.RESULT_GO_HOME);
                TaskList.shouldCloseInstance = true;
                finish();
            }
        }, r.getString(R.string.notify_snooze_title), 10, 10, 0, 120).show();
    }
}