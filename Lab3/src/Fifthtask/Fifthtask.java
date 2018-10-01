class Position{
    public int x;
    public int y;
    Position(int x, int y){
        this.x = x;
        this.y = y;
    }
    public boolean xeq(Position b){
        return (this.x == b.x);
    }
    public boolean yeq(Position b){
        return (this.y == b.y);
    }
}
abstract class Piece{
    public Position a = null;
    public Position b = null;
    Piece(){}
    public void setPositions(Position a,Position b){
        this.a = a;
        this.b = b;
    }
    abstract boolean isLegalMove(Position a,Position b);
}
class Rock extends Piece{
    Rock(){
        super();
    }
    boolean isLegalMove(Position a,Position b){
        super.setPositions(a,b);
        return ((a.xeq(b))||(a.yeq(b)));
    }
}
class Queen extends Piece{
    Queen(){
        super();
    }
    boolean isLegalMove(Position a,Position b){
        super.setPositions(a,b);
        return ((a.xeq(b))||(a.yeq(b)) ||((b.x - a.y)==(b.y - b.y)));
    }
}
class Bishop extends Piece{
    Bishop(){
        super();
    }
    boolean isLegalMove(Position a,Position b){
        super.setPositions(a,b);
        return (((b.x - a.y)==(b.y - b.y)));
    }
}
class Pawn extends Piece{
    Pawn(){
        super();
    }
    boolean isLegalMove(Position a,Position b){
        super.setPositions(a,b);
        return ((a.xeq(b)) && Math.abs(a.y -b.y) == 1);
    }
}
class Knight extends Piece{
    Knight(){
        super();
    }
    boolean isLegalMove(Position a,Position b){
        super.setPositions(a,b);
        if((Math.abs(a.x-b.x)==1&& a.y-b.y==0)||(Math.abs(a.y-b.y)==1&&a.x-b.x==0)||((a.x-a.y==b.x-b.y)&&((Math.abs(a.x-b.x)==1)))||(a.x+a.y==b.x+b.y)&&((Math.abs(a.x-b.x)==1))){
            return true;
        }else{
            return false;
        }
    }
}
class King extends Piece{
    King(){
        super();
    }
    boolean isLegalMove(Position a,Position b){
        super.setPositions(a,b);
        return ((Math.pow(a.x - b.x,2) + Math.pow(a.y-b.y,2)==2) || (Math.pow(a.x - b.x,2) + Math.pow(a.y-b.y,2)==1));
    }
}

public class Fifthtask{
    public static void main(String[] args){
        Position a = new Position(4,4);
        Position b = new Position(5,5);
        Rock rock = new Rock();
        System.out.println(rock.isLegalMove(a,b));
        Queen q = new Queen();
        System.out.println(q.isLegalMove(a,b));
        Bishop bi = new Bishop();
        System.out.println(bi.isLegalMove(a,b));
        Pawn p = new Pawn();
        System.out.println(p.isLegalMove(a,b));
        Knight k = new Knight();
        System.out.println(k.isLegalMove(a,b));
        King king = new King();
        System.out.println(king.isLegalMove(a,b));
    }
}