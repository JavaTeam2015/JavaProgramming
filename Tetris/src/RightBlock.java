import java.awt.Container;

//_|- ����? ����
class RightBlock extends Item
{
    public RightBlock(int area, Container con, int xCnt)
    {
        super(area, 2, 4, xCnt); //��������, ��������, �ǳڰ���
        block_info[0][0] = new Block(0,0);
        block_info[0][1] = new Block(0,1);
        block_info[0][2] = new Block(1,1);
        block_info[0][3] = new Block(1,2);
        block_info[1][0] = new Block(1,0);
        block_info[1][1] = new Block(0,0);
        block_info[1][2] = new Block(0,1);
        block_info[1][3] = new Block(-1,1);
        this.setDefaultRandom(); //��������
        this.setItem(con);   //�����̳ʿ� ���
    }
}