package uk.ac.ebi.pride.toolsuite.gui.task;

/**
 * @author rwang
 * @author yperez
 * Time: 10:49:47
 */
public abstract class TaskAdapter<T, V> extends Task<T, V>{

    @Override
    protected void finished() {

    }

    @Override
    protected void succeed(T results) {
    }

    @Override
    protected void cancelled() {

    }

    @Override
    protected void interrupted(InterruptedException iex) {
    }
}
