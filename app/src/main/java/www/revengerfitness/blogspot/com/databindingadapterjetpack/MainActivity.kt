package www.revengerfitness.blogspot.com.databindingadapterjetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import www.revengerfitness.blogspot.com.databindingadapterjetpack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val post=Post("intro to kotlin","prashant chauhan","https://www.google.com/url?sa=i&url=https%3A%2F%2Fpngfre.com%2Fapple-png%2F&psig=AOvVaw2rC2onhkk1pMC65TPDJe8J&ust=1698405275090000&source=images&cd=vfe&opi=89978449&ved=0CA8QjRxqFwoTCPDcsezKk4IDFQAAAAAdAAAAABAD")

        binding.post=post
    }
}