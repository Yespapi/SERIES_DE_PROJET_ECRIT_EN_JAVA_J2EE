
package guilayout;

public class GUILayout {
    public void go() {
        new BorderEx().show();
        new GridEx().show();
        new FlowEx().show();
        new BuilderLayout().setVisible(true);
    }

    public static void main(String[] args) {
        new GUILayout().go();
    }
}
