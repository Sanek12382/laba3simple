package view;

import java.awt.event.KeyEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class ZoomListener implements MouseWheelListener {

    public GraphicComponent graphic;
    public TaskPanel buttons;
    public MainFrame mainFrame;
    private int ZOOM_RATIO;

    public ZoomListener(MainFrame mainFrame, GraphicComponent graphic, TaskPanel buttons) {
        this.mainFrame = mainFrame;
        this.graphic = graphic;
        this.buttons = buttons;
        this.ZOOM_RATIO = 100;
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent event) {
        if (event.getPreciseWheelRotation() < 0 && KeyEvent.VK_CONTROL != 0) {

            graphic.incrementUnitSegment();
            graphic.repaint();
        }
        if (event.getPreciseWheelRotation() > 0 && KeyEvent.VK_CONTROL != 0) {

            graphic.decrementUnitSegment();
            graphic.repaint();
        }
    }
}
