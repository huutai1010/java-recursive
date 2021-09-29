package recursion_NQueens;
public class QueenPosition {
    int x, y;
    public QueenPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public boolean valid(QueenPosition p) {
        int dx = this.x - p.x;
        if (dx<0) dx=-dx;
        int dy = this.y - p.y;
        if (dy<0) dy=-dy;
        return (dx==0 || dy==0 || dx==dy) ? false: true;
    }
    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
