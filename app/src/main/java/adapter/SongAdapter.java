package adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.daviabrantes.mediaplayer.R;
import com.daviabrantes.mediaplayer.model.Song;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.media_adapter, parent, false);
        }

        Song currentSong = getItem(position);
        TextView txtSongName = listItemView.findViewById(R.id.txt_song_name);
        txtSongName.setText(currentSong.getSong());
        TextView txtArtistName = listItemView.findViewById(R.id.txt_artist_name);
        txtArtistName.setText(currentSong.getArtist());
        return listItemView;
    }

}
