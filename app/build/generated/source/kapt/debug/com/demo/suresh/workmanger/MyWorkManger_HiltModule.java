package com.demo.suresh.workmanger;

import androidx.hilt.work.WorkerAssistedFactory;
import androidx.work.ListenableWorker;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
@InstallIn(SingletonComponent.class)
@OriginatingElement(
    topLevelClass = MyWorkManger.class
)
public interface MyWorkManger_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.demo.suresh.workmanger.MyWorkManger")
  WorkerAssistedFactory<? extends ListenableWorker> bind(MyWorkManger_AssistedFactory factory);
}
