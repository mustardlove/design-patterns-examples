package decorator;

public class UpDownBorder extends Border {
    char ch;

    protected UpDownBorder(Display display, char ch) {
        super(display);
        this.ch = ch;
    }

    public int getColumns() {
        return display.getColumns();
    }

    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    public String getRowText(int row) {
        if (row == 0 || row == this.getRows()-1) {
            return makeLine(ch, this.getColumns());
        } else {
            return display.getRowText(row);
        }
    }

    public String makeLine(char ch, int count) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
