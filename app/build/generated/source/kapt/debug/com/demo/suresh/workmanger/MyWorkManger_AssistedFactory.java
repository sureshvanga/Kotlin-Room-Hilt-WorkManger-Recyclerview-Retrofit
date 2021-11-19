package com.demo.suresh.workmanger;

import androidx.hilt.work.WorkerAssistedFactory;
import dagger.assisted.AssistedFactory;

@AssistedFactory
public interface MyWorkManger_AssistedFactory extends WorkerAssistedFactory<MyWorkManger> {
}
