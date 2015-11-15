# SVTiTest
Selected API http://api.sr.se/api/v2/programs?format=json&pagination=true&page=1&size=20 (list of radio programs)
I’ve used Picasso for images (easy to use, automatic caching.) and Retrofit for networking.
I’m using Presenter layer to improve testing opportunities (an example provided in com.oyra.svti.svtitest.MainPresenterTest). I preferred not to use this mechanism for the DetailesActivity because there’s almost nothing to test:)
