package mathaddict.mathmobilebangundatar;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Wa2n on 04/07/2017.
 */

class SegiempatSwipeAdapter extends PagerAdapter {
    private int[] Image_resources = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,
            R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,
            R.drawable.n,R.drawable.o,R.drawable.p};
    private Context ctx;
    private android.view.LayoutInflater LayoutInflater;

    public SegiempatSwipeAdapter(Context ctx)
    {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return Image_resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return (view==(LinearLayout)o);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater =(android.view.LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = LayoutInflater.inflate(R.layout.swipeimagesegiempat,container,false);
        ImageView imageView = (ImageView) item_view.findViewById(R.id.Image_view);
        imageView.setImageResource(Image_resources[position]);
        container.addView(item_view);
        return  item_view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}