#What is Word Changer?
Word changer is a specially designed plugin that is made to make your life(as a server runner) easier. This plugin is really simple and it shouldn't take you long to get the hang of it. Basically, the idea of this plugin is for the server owner to be able to choose specific words and then have that replaced with another word. Still confused. Here is an example of how it looks. Let's say you don't want people saying "crap" on your server. Well stopping this is easy with Word Changer. You can make it so that the word "crap" is replaced with "****" in a matter of seconds. And the great part about it is that you can add as many of these replaceable words as you like (though the more you have, the more your server lags).
#How do I set it up?
Well, first you just have to do what you do with every plugin. Just put it into the "plugins" folder on your server. Then, if you run the server, there will be a new folder in your plugins folder called "Word Changer." Inside that, you will find a file called "config.yml." Just open that will your text-editing application and your ready to begin.
Inside, you should find my default sample of the format of the program. Here is what it should look like: 
```
OriginMessage1: <3
ReplaceMessage1: \u2764
```
This is showing off the sample format of the config.yml. It is very simple. The origin message is the word you are replacing and the replace message is the word that will be the replacement. Pretty simple. Then after that, just put numbers in numerical order after that phrase like shown above. You can then just add your message after the colon. For example, this one will replace "<3" with the Unicode heart symbol. (If you are confused about the random numbers and letters, I will explain this in the next part.) It is really that simple.
Warning: The words you enter in are case sensitive!
Here is another example. Let's say you are an extreme SkyDoesMinecraft fan. You want it so that whenever people say "gold" that it replaces it with "butter." Well, you would do this: 
```
OriginMessage1: Gold
ReplaceMessage1: Butter
OriginMessage2: gold
ReplaceMessage2: butter
OriginMessage3: GOLD
ReplaceMessage3: BUTTER
```
Pretty cool, huh? Yep, and all you have to do is add two lines in a text document!
#How do I add Unicode Symbols?
Well, as you may have been able to tell from the previous section or from when you tested around with the plugin, Unicode symbols don't work in the same way as everything else. So, if you plan to add "emojis" with Unicode symbols, you should read this. If you tried to use the just the Unicode symbols in your config.yml, you may have noticed that instead of the symbol, it sent through a bunch of random gibberish. This is because these symbols work differently when being sent through Java. So, instead of using the symbol itself, you have to use its source code. Well, you're probably wondering "How do I find this source code?" Well, personally, I use the website: http://www.fileformat.info/info/unicode/char/search.htm This website allows you to search for Unicode symbols and then allows you to find out information about it. So, use the search to find the symbol you want. Then, when you get to it, you're going to have to go to the "encodings" table. Then, find its "C/C++/Java source code." The code next to that is all you have to type into your config to get it to show up correctly.
#In Conclusion
This is a simple and useful plugin if you want to make one word/phrase into another word/phrase. It could be used for a chat filter, to add emojis, or to just troll your friends. And it is extremely easy to use. It is a useful alley for any server. Finally, if you want to take a look at the source code, here it is: https://github.com/Kippii/Word-Changer
