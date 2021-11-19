package com.demo.suresh.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/demo/suresh/model/TypeConverterOwner;", "", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "someObjectListToString", "", "someobject", "Lcom/demo/suresh/model/Owner;", "stringToSomeObjectList", "data", "app_debug"})
public final class TypeConverterOwner {
    @org.jetbrains.annotations.NotNull()
    private final com.google.gson.Gson gson = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final com.demo.suresh.model.Owner stringToSomeObjectList(@org.jetbrains.annotations.Nullable()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String someObjectListToString(@org.jetbrains.annotations.Nullable()
    com.demo.suresh.model.Owner someobject) {
        return null;
    }
    
    public TypeConverterOwner() {
        super();
    }
}