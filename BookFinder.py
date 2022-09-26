import sys
import webbrowser

Book = ""
start = 1
if(sys.argv[1] == "buy"):start = 2
for i in range (start,len(sys.argv)):
    Book += (sys.argv[i] + " ")
if(sys.argv[1] == "buy"):
   webbrowser.open("https://www.barnesandnoble.com/s/" + Book)
   webbrowser.open_new_tab("http://www.amazon.com/s?k=" + Book + "&i=stripbooks")
   webbrowser.open_new_tab("https://www.booksamillion.com/search?filter=&id=8179156492718&query=" + Book)
   webbrowser.open_new_tab("https://www.audible.com/search?keywords=" + Book)
   webbrowser.open_new_tab("https://play.google.com/store/search?q=" + Book + "&c=books")
else:
	webbrowser.open_new_tab("https://brooklyn.overdrive.com/search?query=" + Book)
	webbrowser.open_new_tab("https://fairfax.overdrive.com/search?query=" + Book)
	webbrowser.open_new_tab("https://www.scribd.com/search?content_type=tops&page=1&query=" + Book)

