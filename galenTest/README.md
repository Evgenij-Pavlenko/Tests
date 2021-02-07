Galen Framework Demo
=====================================

This project is used in order to demonstrate the features of [Galen Framework](http://galenframework.com)

Sample localisation tests will be executed on the Listing page


Prerequisites
=====================================

- Java v1.8+
- NodeJS (npm installation)
- Git
- Chrome browser


Galen Installation (macOS & Linux)
=====================================

NPM Installation:
-------------------------------------
```
sudo npm install -g galenframework-cli
```

If you have issues installing Galen via npm please download the [archive](http://galenframework.com/download/), extract it and execute the following command via Terminal:
-------------------------------------
```
sudo ./install.sh
```

To check whether Galen was successfully installed please run the following command in your Terminal:
-------------------------------------
```
galen -v
```

Galen Installation (Windows)
=====================================
Please follow the [instructions](http://mindengine.net/post/2014-01-08-configuring-galen-framework-for-windows/#.X5aMOZNKhsM) in order to install Galen for Windows.

Running Tests
=====================================


In order to run a test suite:

```
galen test test/i18n_listing_page.test
```