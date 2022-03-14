package com.example.androidass7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.recyclerview.widget.GridLayoutManager
import com.example.androidass7.adapter.AlbumAdapter
import com.example.androidass7.model.Album
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = ArrayList<Album>()
        data.add(Album(1,R.drawable.img1,"Hip-Hop/Rap","3 songs"))
        data.add(Album(2,R.drawable.img2,"House","2 songs"))
        data.add(Album(3,R.drawable.img3,"Indie","1 songs"))
        data.add(Album(4,R.drawable.img4,"Indie Rock","5 songs"))
        data.add(Album(5,R.drawable.img5,"Chill","2 songs"))
        data.add(Album(6,R.drawable.img1,"Imagine","1 songs"))

        recyclerView.layoutManager = GridLayoutManager(this,2)
        val albumAdapter = AlbumAdapter(this,data)
        recyclerView.adapter = albumAdapter

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
}