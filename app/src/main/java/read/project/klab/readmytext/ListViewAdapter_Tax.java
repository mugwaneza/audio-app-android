package read.project.klab.readmytext;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter_Tax extends BaseAdapter {

	// Declare Variables
    private MediaPlayer mp;
	Context mContext;
	LayoutInflater inflater;
	private List<WorldPopulation> worldpopulationlist = null;
	private ArrayList<WorldPopulation> arraylist;

	public ListViewAdapter_Tax(Context context, List<WorldPopulation> worldpopulationlist) {
		mContext = context;
		this.worldpopulationlist = worldpopulationlist;
		inflater = LayoutInflater.from(mContext);
		this.arraylist = new ArrayList<WorldPopulation>();
		this.arraylist.addAll(worldpopulationlist);
        mp = new MediaPlayer();
	}

	public class ViewHolder {

		TextView listContent;

	}

	@Override
	public int getCount() {
		return worldpopulationlist.size();
	}

	@Override
	public WorldPopulation getItem(int position) {
		return worldpopulationlist.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	public View getView(final int position, View view, ViewGroup parent) {
		final ViewHolder holder;
		if (view == null) {
			holder = new ViewHolder();
			view = inflater.inflate(R.layout.listview_item, null);


			// Locate the TextViews in listview_item.xml
            holder.listContent = (TextView) view.findViewById(R.id.listContent);
			view.setTag(holder);
		} else {
			holder = (ViewHolder) view.getTag();
		}


        // Set the results into TextViews


        holder.listContent.setText(worldpopulationlist.get(position).getlistContent());

		// Listen for ListView Item Click
	    	view.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// Send single item click data to SingleItemView Class
                String mytitle=holder.listContent.getText().toString();

                if(mytitle.equals("Ndagenda")) {
                    // Play song

                    Intent intent = new Intent(mContext, SingleItemView_Tax.class);
                    // Pass all data pronounciation
                    // Pass all data country
                    intent.putExtra("text",(worldpopulationlist.get(position).getlistContent()));
                    // Pass all data population
                    // Pass all data flag
                    // Start SingleItemView Class
                    mContext.startActivity(intent);
                    mp.reset();// stops any current playing song
                    mp = MediaPlayer.create(mContext, R.raw.ndagenda);// create's
                    mp.start(); // starting mediaplayer

                }else if(mytitle.equals("Ndishyura angahe")) {


                    Intent intent = new Intent(mContext, SingleItemView_Tax.class);

                    // Pass all data pronounciation
                    // Pass all data country
                    intent.putExtra("text",(worldpopulationlist.get(position).getlistContent()));
                    // Pass all data population
                    // Pass all data flag
                    // Start SingleItemView Class
                    mContext.startActivity(intent);

                    // Play song
                    mp.reset();// stops any current playing song
                    mp = MediaPlayer.create(mContext, R.raw.ndishyuraangahe);// create's
                    mp.start(); // starting mediaplayer

                }else if(mytitle.equals("murakoze")) {


                    Intent intent = new Intent(mContext, SingleItemView_Tax.class);

                    // Pass all data pronounciation
                    // Pass all data country
                    intent.putExtra("text",(worldpopulationlist.get(position).getlistContent()));
                    // Pass all data population
                    // Pass all data flag
                    // Start SingleItemView Class
                    mContext.startActivity(intent);

                    // Play song
                    mp.reset();// stops any current playing song
                    mp = MediaPlayer.create(mContext, R.raw.murakoze);// create's
                    mp.start(); // starting mediaplayer

                }else if(mytitle.equals("mwiriwe")) {

                    Intent intent = new Intent(mContext, SingleItemView_Tax.class);

                    // Pass all data pronounciation
                    // Pass all data country
                    intent.putExtra("text",(worldpopulationlist.get(position).getlistContent()));
                    // Pass all data population
                    // Pass all data flag
                    // Start SingleItemView Class
                    mContext.startActivity(intent);


                    // Play song
                    mp.reset();// stops any current playing song
                    mp = MediaPlayer.create(mContext, R.raw.mwiriwe);// create's
                    mp.start(); // starting mediaplayer

                }else if(mytitle.equals("oya")) {

                    Intent intent = new Intent(mContext, SingleItemView_Tax.class);

                    // Pass all data pronounciation
                    // Pass all data country
                    intent.putExtra("text",(worldpopulationlist.get(position).getlistContent()));
                    // Pass all data population
                    // Pass all data flag
                    // Start SingleItemView Class
                    mContext.startActivity(intent);

                    // Play song
                    mp.reset();// stops any current playing song
                    mp = MediaPlayer.create(mContext, R.raw.oya);// create's
                    mp.start(); // starting mediaplayer

                }else if(mytitle.equals("ndatega moto")) {

                    Intent intent = new Intent(mContext, SingleItemView_Tax.class);

                    // Pass all data pronounciation
                    // Pass all data country
                    intent.putExtra("text",(worldpopulationlist.get(position).getlistContent()));
                    // Pass all data population
                    // Pass all data flag
                    // Start SingleItemView Class
                    mContext.startActivity(intent);

                    // Play song
                    mp.reset();// stops any current playing song
                    mp = MediaPlayer.create(mContext, R.raw.ndategamoto);// create's
                    mp.start(); // starting mediaplayer

                }else if(mytitle.equals("ndatega tagisi")) {

                    Intent intent = new Intent(mContext, SingleItemView_Tax.class);

                    // Pass all data pronounciation
                    // Pass all data country
                    intent.putExtra("text",(worldpopulationlist.get(position).getlistContent()));
                    // Pass all data population
                    // Pass all data flag
                    // Start SingleItemView Class
                    mContext.startActivity(intent);

                    // Play song
                    mp.reset();// stops any current playing song
                    mp = MediaPlayer.create(mContext, R.raw.ndategatagisi);// create's
                    mp.start(); // starting mediaplayer

                }else if(mytitle.equals("ndasigara hano")) {

                    Intent intent = new Intent(mContext, SingleItemView_Tax.class);

                    // Pass all data pronounciation
                    // Pass all data country
                    intent.putExtra("text",(worldpopulationlist.get(position).getlistContent()));
                    // Pass all data population
                    // Pass all data flag
                    // Start SingleItemView Class
                    mContext.startActivity(intent);

                    // Play song
                    mp.reset();// stops any current playing song
                    mp = MediaPlayer.create(mContext, R.raw.ndasigarahano);// create's
                    mp.start(); // starting mediaplayer

                }
			}
		});
		return view;
	}

	// Filter Class
	public void filter(String charText) {
		charText = charText.toLowerCase(Locale.getDefault());
		worldpopulationlist.clear();
		if (charText.length() == 0) {
			worldpopulationlist.addAll(arraylist);
		} 
		else 
		{
			for (WorldPopulation wp : arraylist) 
			{
				if (wp.getlistContent().toLowerCase(Locale.getDefault()).contains(charText))
				{
					worldpopulationlist.add(wp);
				}
			}
		}
		notifyDataSetChanged();
	}




}
