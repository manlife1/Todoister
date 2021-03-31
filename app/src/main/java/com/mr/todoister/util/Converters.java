package com.mr.todoister.util;

import androidx.room.TypeConverter;

import com.mr.todoister.model.Priority;

import java.util.Date;

public class Converters {

    @TypeConverter
    public static Date fromTimestamp(Long value){
        return (value==null) ? null : new Date(value);
    }

    @TypeConverter
    public static Long dateToStamp(Date value){
        return (value==null) ? null : value.getTime();
    }

    @TypeConverter
    public static String fromPriority(Priority priority){
        return priority==null ? null : priority.name();
    }

    @TypeConverter
    public static Priority toPriority(String priority){
        return priority==null ? null :Priority.valueOf(priority) ;
    }
}
