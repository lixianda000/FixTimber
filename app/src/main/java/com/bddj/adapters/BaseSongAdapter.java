package com.bddj.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.bddj.MusicPlayer;
import com.bddj.models.Song;
import com.bddj.utils.NavigationUtils;
import com.bddj.utils.TimberUtils;
import com.google.android.gms.cast.framework.CastSession;

import java.util.List;

/**
 * Created by naman on 7/12/17.
 */

public class BaseSongAdapter<V extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<V> {

    @Override
    public V onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(V holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    public class ItemHolder extends RecyclerView.ViewHolder {

        public ItemHolder(View view) {
            super(view);
        }

    }

    public void playAll(final Activity context, final long[] list, int position,
                        final long sourceId, final TimberUtils.IdType sourceType,
                        final boolean forceShuffle, final Song currentSong, boolean navigateNowPlaying) {

//        if (context instanceof BaseActivity) {
//            CastSession castSession = ((BaseActivity) context).getCastSession();
//            if (castSession != null) {
//                navigateNowPlaying = false;
//                TimberCastHelper.startCasting(castSession, currentSong);
//            } else {
//                MusicPlayer.playAll(context, list, position, -1, TimberUtils.IdType.NA, false);
//            }
//        } else {
//            MusicPlayer.playAll(context, list, position, -1, TimberUtils.IdType.NA, false);
//        }
        MusicPlayer.playAll(context, list, position, -1, TimberUtils.IdType.NA, false);

        if (navigateNowPlaying) {
            NavigationUtils.navigateToNowplaying(context, true);
        }


    }
    public void removeSongAt(int i){}
    public void updateDataSet(List<Song> arraylist) {}

}
