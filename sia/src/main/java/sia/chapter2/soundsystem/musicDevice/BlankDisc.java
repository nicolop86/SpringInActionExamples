package sia.chapter2.soundsystem.musicDevice;

import java.util.List;

import org.springframework.stereotype.Component;

@Component("blankDisc")
public class BlankDisc implements CompactDisc {

	private String title;
	private String artist;
	private List<String> trackList;

	public BlankDisc(String title, String artist, List<String> trackList){
		setArtist(artist);
		setTitle(title);
		setTrackList(trackList);
	}

	@Override
	public void play() {
		System.out.println("Title: " + title);
		System.out.println("Artist: " + artist);
		System.out.println("Tracks");
		if(!trackList.isEmpty())
			for(String track : trackList){
				System.out.println(track);
			}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public List<String> getTrackList() {
		return trackList;
	}

	public void setTrackList(List<String> trackList) {
		this.trackList = trackList;
	}

}
