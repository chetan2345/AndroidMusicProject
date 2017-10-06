# AndroidMusicProject
A skeleton music player for android designed on Android Studio

The main activity is a generic music player screen with a large album picture, the song title, and a SeekBar to detect how much of the song has been played. There is a play button which turns into a pause button when the music is playing and there are previous and next buttons. I was very unfamiliar with the use of a SeekBar so I had to rely a lot on stackOverflow and android developers to figure small things out liek the necessity of "progressBar.setOnSeekBarChangeListener(this);". Then on my main activity screen there is a drop down menu that has the option of taking you to the full songs list. This uses an intent to go to another activity. The PlayListActivity is a list view of songs. The logic of my code came into play in my MainActivity. I created a songList which was an array of Song objects, where each song object has a title and path. I used onClickListeners to determine if play and next and previous were pressed. This is where I had to do more research. I had to use a mediaPlayer to actually stimulate the playing of the music. I had to look at the internet for a lot of the small features that I had to include to ensure my media player would work properly, like destroy(). The logic of the main app is that it asks for the dangerous peprmission of reading storage (hard requirement), browses through the phone's SD card and filters out any .mp3 files. It then uses the bitcode of the .mp3 file to set the song path and title from the file (I had to learn how to do this via stackOverflow). This creates a new song object which is then added to my songList. I used dangerous permissions, a menu, a listView, and multiple activites.
