package org.xstefank.lra.execution;

import org.xstefank.lra.definition.LRADefinition;
import org.xstefank.lra.model.LRAResult;

import java.net.URL;
import java.util.concurrent.Future;


public interface LRAExecutor {

    /**
     * Starts and executes LRA and block until it is finished
     *
     * @param lraDefinition the definition of the LRA according to which it is to be ececuted
     */
    LRAResult executeLRA(LRADefinition lraDefinition);

    /**
     * Starts and executes the LRA asynchronously in order defined by the action list
     *
     * @param lraDefinition the definition of the LRA according to which it is to be executed
     */
    Future<LRAResult> executeLRAAsync(LRADefinition lraDefinition);

    /**
     * Starts new LRA
     *
     * @param lraDefinition the definition of LRA
     * @return the LRA identification
     */
    URL startLRA(LRADefinition lraDefinition);
}
