import sys
import webbrowser

Writer = ""
start = 1
for i in range (start,len(sys.argv)):
    Writer += (sys.argv[i] + " ")
webbrowser.open_new_tab("https://twitter.com/search?q=(from:" + Writer + ')until:2020-02-29since:2020-01-01&src=typed_query&f=live' )
