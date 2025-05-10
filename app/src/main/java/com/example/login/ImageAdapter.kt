import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView

class ImageAdapter(private val context: Context, private val images: Array<Int>) : BaseAdapter() {
    override fun getCount(): Int = images.size
    override fun getItem(position: Int): Any = images[position]
    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val imageView: ImageView = convertView as? ImageView ?: ImageView(context)
        imageView.setImageResource(images[position])
        imageView.scaleType = ImageView.ScaleType.CENTER_CROP
        imageView.layoutParams = ViewGroup.LayoutParams(300, 300)
        return imageView
    }
}

annotation class ImageView
