### Testing my first git repo

### For Gradle:<br/>
Add it in your root build.gradle at the end of repositories:
```bash
allprojects {
    repositories {
	  maven { 	
	    url 'https://jitpack.io' 
	     }
	   }
	}
```	
Add it in your root build.gradle at the end of repositories:
```bash
dependencies
{
   compile 'com.github.karthi72:MyToast:1.0.0'
 }
  ```

### For Maven :
```bash
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
Add the dependency:
```bash
<dependency>
	    <groupId>com.github.karthi72</groupId>
	    <artifactId>MyToast</artifactId>
	    <version>1.0.0</version>
	</dependency>
  ```
  
