import java.awt.Container;

class LineBlock extends Item
{
    public LineBlock(int area, Container con, int xCnt)
    {
        super(area, 2, 4, xCnt); //영역길이, 각도갯수, 판넬개수
        block_info[0][0] = new Block(0,-1);
        block_info[0][1] = new Block(0,0);
        block_info[0][2] = new Block(0,1);
        block_info[0][3] = new Block(0,2);
        block_info[1][0] = new Block(-1,0);
        block_info[1][1] = new Block(0,0);
        block_info[1][2] = new Block(1,0);
        block_info[1][3] = new Block(2,0);
        this.setDefaultRandom(); //랜덤셋팅
        this.setItem(con);   //컨테이너에 등록
    }
}
