package mathaddict.mathmobilebangundatar;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Wa2n on 30/07/2017.
 */

class AboutSwipeAdapter extends PagerAdapter {
    private int[] Image_resources = {R.drawable.tentang,R.drawable.aboutru};
    private Context ctx;
    private android.view.LayoutInflater LayoutInflater;

    public AboutSwipeAdapter(Context ctx)
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
        View item_view = LayoutInflater.inflate(R.layout.swipeimageabout,container,false);
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
