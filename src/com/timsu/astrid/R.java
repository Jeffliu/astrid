/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.timsu.astrid;

public final class R {
    public static final class array {
        public static final int availability=0x7f040006;
        /**  Order matters, and note that the preference for which day the week starts on is handled
         elsewhere (and needn't be addressed here). 
         */
        public static final int day_labels=0x7f040008;
        /**  The corresponding indices are defined in DeleteEventHelper.java 
         */
        public static final int delete_repeating_labels=0x7f04000c;
        /**  The corresponding indices are defined in DeleteEventHelper.java 
 This is the same array as above (the "delete_repeating_labels" array,
         except that the first element "Only this event" is removed.  This
         array exists to work-around a bug in the CalendarProvider and sync
         code where you can't delete one instance of a repeating event that
         was created on the phone until that event has been synced to the server.
     
         */
        public static final int delete_repeating_labels_no_selected=0x7f04000d;
        public static final int ordinal_labels=0x7f040009;
        public static final int preferences_alert_type_labels=0x7f040004;
        public static final int preferences_alert_type_values=0x7f040005;
        public static final int preferences_default_reminder_labels=0x7f040002;
        public static final int preferences_default_reminder_values=0x7f040003;
        /**  Choices for the "Reminder minutes" spinner.
         These must be kept in sync with the reminder_minutes_values array.
    
         */
        public static final int reminder_minutes_labels=0x7f040000;
        public static final int reminder_minutes_values=0x7f040001;
        /**  Invitation responses 
         */
        public static final int response_labels1=0x7f04000a;
        public static final int response_labels2=0x7f04000b;
        public static final int visibility=0x7f040007;
    }
    public static final class attr {
    }
    public static final class color {
        public static final int importance_1=0x7f050005;
        public static final int importance_2=0x7f050006;
        public static final int importance_3=0x7f050007;
        public static final int importance_4=0x7f050008;
        public static final int task_list_done=0x7f050001;
        public static final int task_list_overdue=0x7f050000;
        public static final int view_header_done=0x7f050002;
        public static final int view_table_overdue=0x7f050004;
        public static final int view_table_values=0x7f050003;
    }
    public static final class drawable {
        public static final int highlight_pressed=0x7f020000;
        public static final int highlight_selected=0x7f020001;
        public static final int ic_dialog_time=0x7f020002;
        public static final int icon=0x7f020003;
        public static final int strikeout=0x7f020004;
        public static final int timepicker_down_btn=0x7f020005;
        public static final int timepicker_down_disabled=0x7f020006;
        public static final int timepicker_down_disabled_focused=0x7f020007;
        public static final int timepicker_down_normal=0x7f020008;
        public static final int timepicker_down_pressed=0x7f020009;
        public static final int timepicker_down_selected=0x7f02000a;
        public static final int timepicker_input=0x7f02000b;
        public static final int timepicker_input_disabled=0x7f02000c;
        public static final int timepicker_input_normal=0x7f02000d;
        public static final int timepicker_input_pressed=0x7f02000e;
        public static final int timepicker_input_selected=0x7f02000f;
        public static final int timepicker_up_btn=0x7f020010;
        public static final int timepicker_up_disabled=0x7f020011;
        public static final int timepicker_up_disabled_focused=0x7f020012;
        public static final int timepicker_up_normal=0x7f020013;
        public static final int timepicker_up_pressed=0x7f020014;
        public static final int timepicker_up_selected=0x7f020015;
        public static final int transparent_button=0x7f020016;
    }
    public static final class id {
        public static final int addtask=0x7f090023;
        public static final int button_layout=0x7f090029;
        public static final int cb1=0x7f090025;
        public static final int cell_definiteDueDate=0x7f09002f;
        public static final int cell_elapsed=0x7f09002d;
        public static final int cell_estimated=0x7f09002e;
        public static final int cell_notes=0x7f090031;
        public static final int cell_preferredDueDate=0x7f090030;
        public static final int dates_container=0x7f09000d;
        public static final int decrement=0x7f090002;
        public static final int definiteDueDate_date=0x7f090010;
        public static final int definiteDueDate_label=0x7f09000e;
        public static final int definiteDueDate_notnull=0x7f09000f;
        public static final int definiteDueDate_time=0x7f090011;
        public static final int delete=0x7f090020;
        public static final int discard=0x7f09001f;
        public static final int edit=0x7f09002c;
        public static final int elapsedDuration=0x7f09001d;
        public static final int elapsedDuration_label=0x7f09001c;
        public static final int estimatedDuration=0x7f09000a;
        public static final int estimatedDuration_label=0x7f090009;
        public static final int event=0x7f090005;
        public static final int hiddenUntil_date=0x7f090018;
        public static final int hiddenUntil_label=0x7f090016;
        public static final int hiddenUntil_notnull=0x7f090017;
        public static final int hiddenUntil_time=0x7f090019;
        public static final int image1=0x7f090026;
        public static final int importance=0x7f09000c;
        public static final int importance_label=0x7f09000b;
        public static final int increment=0x7f090000;
        public static final int name=0x7f090007;
        public static final int name_label=0x7f090006;
        public static final int notes=0x7f09001b;
        public static final int notes_label=0x7f09001a;
        public static final int numberPicker=0x7f090003;
        public static final int preferredDueDate_date=0x7f090014;
        public static final int preferredDueDate_label=0x7f090012;
        public static final int preferredDueDate_notnull=0x7f090013;
        public static final int preferredDueDate_time=0x7f090015;
        public static final int progress=0x7f09002b;
        public static final int properties_container=0x7f090008;
        public static final int row_layout=0x7f090024;
        public static final int save=0x7f09001e;
        public static final int scroll_view=0x7f090004;
        public static final int tasklist=0x7f090022;
        public static final int tasklist_layout=0x7f090021;
        public static final int text1=0x7f090027;
        public static final int timepicker_input=0x7f090001;
        public static final int timerButton=0x7f09002a;
        public static final int view_layout=0x7f090028;
    }
    public static final class layout {
        public static final int number_picker=0x7f030000;
        public static final int number_picker_dialog=0x7f030001;
        public static final int task_edit=0x7f030002;
        public static final int task_list=0x7f030003;
        public static final int task_list_row=0x7f030004;
        public static final int task_view=0x7f030005;
    }
    public static final class plurals {
        /**  Time Constants 
         */
        public static final int Ndays=0x7f070001;
        public static final int Nhours=0x7f070002;
        public static final int Nminutes=0x7f070003;
        public static final int Nseconds=0x7f070004;
        /**  Plurals 
         */
        public static final int Ntasks=0x7f070000;
    }
    public static final class string {
        public static final int addtask_label=0x7f060007;
        /**  application 
         */
        public static final int app_name=0x7f060000;
        public static final int blank_button_title=0x7f060023;
        public static final int blockingOn_label=0x7f06001c;
        public static final int definiteDueDate_label=0x7f060019;
        public static final int delete_label=0x7f060022;
        public static final int delete_this_task_title=0x7f060032;
        public static final int delete_title=0x7f060031;
        public static final int discard_label=0x7f060021;
        public static final int edit_label=0x7f060029;
        public static final int elapsedDuration_label=0x7f060016;
        public static final int estimatedDuration_label=0x7f060015;
        public static final int hiddenUntil_label=0x7f06001b;
        /**  Importance Labels 
         */
        public static final int importance_1=0x7f060001;
        public static final int importance_2=0x7f060002;
        public static final int importance_3=0x7f060003;
        public static final int importance_4=0x7f060004;
        public static final int importance_label=0x7f060017;
        public static final int minutes_dialog=0x7f06001f;
        public static final int name_hint=0x7f060014;
        public static final int name_label=0x7f060013;
        public static final int notes_hint=0x7f06001e;
        public static final int notes_label=0x7f06001d;
        public static final int overdue_suffix=0x7f06002f;
        public static final int preferredDueDate_label=0x7f06001a;
        public static final int progress_dialog=0x7f060030;
        public static final int progress_suffix=0x7f060028;
        public static final int save_label=0x7f060020;
        public static final int startTimer_label=0x7f060026;
        public static final int stopTimer_label=0x7f060027;
        public static final int tags_label=0x7f060018;
        public static final int taskEdit_menu_save=0x7f060024;
        public static final int taskEdit_titleGeneric=0x7f060011;
        public static final int taskEdit_titlePrefix=0x7f060012;
        public static final int taskList_context_delete=0x7f06000d;
        public static final int taskList_context_edit=0x7f06000c;
        public static final int taskList_filter_done=0x7f060010;
        public static final int taskList_filter_hidden=0x7f06000f;
        public static final int taskList_filter_title=0x7f06000e;
        public static final int taskList_hiddenSuffix=0x7f060006;
        public static final int taskList_menu_filters=0x7f06000b;
        public static final int taskList_menu_insert=0x7f060008;
        public static final int taskList_menu_settings=0x7f06000a;
        public static final int taskList_menu_tags=0x7f060009;
        public static final int taskList_titlePrefix=0x7f060005;
        public static final int taskView_definiteDueDate=0x7f06002c;
        public static final int taskView_elapsed=0x7f06002a;
        public static final int taskView_estimated=0x7f06002b;
        public static final int taskView_notes=0x7f06002e;
        public static final int taskView_preferredDueDate=0x7f06002d;
        public static final int taskView_title=0x7f060025;
    }
    public static final class style {
        public static final int Alert=0x7f080000;
        public static final int MonthView_DayLabel=0x7f080001;
        public static final int TextAppearance=0x7f080002;
        public static final int TextAppearance_AgendaView_ValueLabel=0x7f080004;
        public static final int TextAppearance_Alert_Label=0x7f080007;
        public static final int TextAppearance_Alert_Title=0x7f080006;
        public static final int TextAppearance_Alert_Value=0x7f080008;
        public static final int TextAppearance_EditEvent_Label=0x7f080005;
        public static final int TextAppearance_MonthView_DayLabel=0x7f080003;
    }
}