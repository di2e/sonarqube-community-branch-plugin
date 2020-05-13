package com.github.mc1arke.sonarqube.plugin.ce;

import org.sonar.ce.configuration.WorkerCountProvider;

public class StaticWorkerCountProvider implements WorkerCountProvider {

    @Override
    public int get() {
        //default to 3, can be changed on the UI
        return 3;
    }

}
