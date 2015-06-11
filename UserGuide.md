## Quick Start ##

Launch the application and press the 'Start' button.  The GPS receiver will turn on, and once it has locked on your position with reasonable accuracy it will begin recording points.  Press the 'Stop' button to turn off the GPS receiver.  Press the 'Export KML to SD Card' to write out your current trip as a KML file on your handset's SD card.  GPSLogger will write out KML files in the /GPSLogger folder.

## KML Export Details ##

The application records one trip at a time.  Each time you enter a new trip name and press 'Start New Trip', the current database of location points will be exported to your SD card using the previous trip name, then the database will be cleared.

When you export a KML file with the 'Ground' radio button selected, the resulting KML file will use the 'clampToGround' altitude mode, ignoring the recorded altitude.  If you were recording points while airborne, select the 'Air' radio button before exporting to have the KML use the 'absolute' altitude mode, so Google Earth will display your path above the ground according to the recorded altitude.

I've noticed that the G1 seems to be consistently low in the altitude it records.  Seems a lot of handsets with built-in GPS receivers have the same issue.  So there's an 'Altitude Correction' value that will be applied to the exported KML file.  Again, the altitude is only relevant in the KML file when you've recorded while airborne and export with the 'Air' setting.  How far off is your G1 from the actual altitude?  Mine seems to be right about 20 meters low.  You might need to run a few exports with different values.

One note: you _cannot_ export files to your SD card while the handset is mounted by a computer with a USB cable.