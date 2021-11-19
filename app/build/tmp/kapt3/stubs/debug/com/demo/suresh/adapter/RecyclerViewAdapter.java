package com.demo.suresh.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0016\u0010\u0011\u001a\u00020\n2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/demo/suresh/adapter/RecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/demo/suresh/adapter/RecyclerViewAdapter$MyViewHolder;", "()V", "listData", "", "Lcom/demo/suresh/model/RepositoryData;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setListData", "MyViewHolder", "app_debug"})
public final class RecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.demo.suresh.adapter.RecyclerViewAdapter.MyViewHolder> {
    private java.util.List<com.demo.suresh.model.RepositoryData> listData;
    
    public final void setListData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.demo.suresh.model.RepositoryData> listData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.demo.suresh.adapter.RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.demo.suresh.adapter.RecyclerViewAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public RecyclerViewAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/demo/suresh/adapter/RecyclerViewAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "description_textview", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getDescription_textview", "()Landroid/widget/TextView;", "image_avatar_url", "Landroid/widget/ImageView;", "getImage_avatar_url", "()Landroid/widget/ImageView;", "name_textview", "getName_textview", "bind", "", "data", "Lcom/demo/suresh/model/RepositoryData;", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView image_avatar_url = null;
        private final android.widget.TextView name_textview = null;
        private final android.widget.TextView description_textview = null;
        
        public final android.widget.ImageView getImage_avatar_url() {
            return null;
        }
        
        public final android.widget.TextView getName_textview() {
            return null;
        }
        
        public final android.widget.TextView getDescription_textview() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.demo.suresh.model.RepositoryData data) {
        }
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}