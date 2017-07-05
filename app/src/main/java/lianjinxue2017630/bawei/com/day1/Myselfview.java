package lianjinxue2017630.bawei.com.day1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * 创建者： 廉锦雪
 * 创建时间:2017/7/58:45
 */

public class Myselfview extends View{
    private Paint mpaint;

    public Myselfview(Context context) {
        this(context,null);
    }

    public Myselfview(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public Myselfview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //画出笔 设置上颜色  长度 平滑度
        mpaint = new Paint();
        mpaint.setColor(Color.BLACK);
        mpaint.setTextSize(18);
        mpaint.setAntiAlias(true);

    }
    //Canvas为画布  可以画出任意图形
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //画出矩形
        canvas.drawRect(0,0,100,100,mpaint);
       invalidate();
    }
}
