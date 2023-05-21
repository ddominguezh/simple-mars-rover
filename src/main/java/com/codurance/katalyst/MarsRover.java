package com.codurance.katalyst;

public class MarsRover {
    
    private Board board;
    private Coordinate coordinate;
    private Direction direction;
    protected MarsRover(Board board, Coordinate coordinate, Direction direction) {
        this.board = board;
        this.coordinate = coordinate;
        this.direction = direction;
    }
    public static MarsRover create(){
        return new MarsRover(Board.create(10), Coordinate.create(0, 0), Direction.NORTH);
    }
    public String execute(String command) {
        for(String action : command.split("")){
            if("M".equals(action)){
                this.coordinate = this.coordinate.move(this.direction);
                if(this.board.outOfLimit(coordinate)){
                    this.coordinate = this.board.opposite(coordinate);
                }
            }else{
                this.direction = this.direction.rotate(Rotate.from(action));
            }
        }
        return this.coordinate.x() + ":" + this.coordinate.y() + ":" + this.direction.toString();
    }
}
