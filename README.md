# Setup Documentation

Hi,

I made this little setup document to help with any kind of issues that might occur during setup.

## Prerequisites:

### Java Development Kit (JDK):
- Ensure you have JDK installed. You can download and install it from the Oracle website or use OpenJDK.

### Maven:
- Install Maven to manage the project's build. You can download it from the Apache Maven website and follow the installation instructions.

### Chrome WebDriver:
- Download the Chrome WebDriver compatible with your Chrome browser version. Ensure the WebDriver version matches your Chrome browser version.

### Google Chrome Browser:
- Linux users need to ensure that Google Chrome is installed. If it's not installed, you can install it using the following command:
  ```bash
  wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
  sudo dpkg -i google-chrome-stable_current_amd64.deb
  sudo apt-get install -f  # This resolves any dependencies that might be needed
  google-chrome --version
  

### Configuration Steps:
- Ensure your Chrome browser is installed and up to date. For Linux, you can download it from the Google Chrome website or use your package manager to install it.
- Verify the compatibility between Chrome WebDriver and the Chrome browser version.
- Make sure the necessary dependencies are resolved by Maven during the build process.
- Modify the `CHROME_DRIVER_PATH` in your project settings to point to the location where the Chrome WebDriver is stored. For Linux users, ensure that you have set the executable permission for the WebDriver:

  ```bash
  chmod +x path/to/chromedriver

I hope you enjoy,

Fabio Ghetler
