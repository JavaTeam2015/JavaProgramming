import java.awt.Container;


class Rect extends Item
{
    public Rect(int area, Container con, int xCnt)
    {
        super(area, 1, 4, xCnt); //��������, ��������, �ǳڰ���
        block_info[0][0] = new Block(0,0);
        block_info[0][1] = new Block(0,1);
        block_info[0][2] = new Block(1,0);
        block_info[0][3] = new Block(1,1);
        this.setDefaultRandom(); //��������
        this.setItem(con);   //�����̳ʿ� ���
    }
}