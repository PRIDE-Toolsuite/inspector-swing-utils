package uk.ac.ebi.pride.toolsuite.gui.listener;

import java.util.EventListener;

/**
 * ToDo: move this into Desktop
 * @author rwang
 */
public interface ExitListener extends EventListener {

    public boolean isReady();
    public void performExit();
}
