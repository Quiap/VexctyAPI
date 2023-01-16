Vexcty Public API (Java)
======
[![Maven Package](https://github.com/MOONSWORKSHOPLLC/VexctyAPI/actions/workflows/maven.yml/badge.svg)](https://github.com/MOONSWORKSHOPLLC/VexctyAPI/actions/workflows/maven.yml)

This is a Java implementation of the Vexcty API. For discussing the API, requesting help or suggestions you can use the
GitHub [Discussions](https://github.com/MOONSWORKSHOPLLC/VexctyAPI/discussions).

### Documentation

Vexcty Public API documentation can be found at [https://vexcty.com/api](https://vexcty.com/api). Java
documentation can be found in the code.

### GitHub Issues

GitHub issues should only be used to report bugs. Everything else should be in GitHub discussions.

### Usage

You can use this API as a dependency via the public Vexcty maven repo.
#### Vexcty Maven Repo

```xml


		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>


	<dependency>
	    <groupId>com.github.somerandomguythatneedshelp</groupId>
	    <artifactId>VexctyAPI</artifactId>
	    <version>Tag</version>
	</dependency>
```

This repo can also be used with Gradle.

```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
    
   	dependencies {
	        implementation 'com.github.somerandomguythatneedshelp:VexctyAPI:Tag'
	} 
```

### Contributing

When Contributing, please make a pull request on Github and will try to get back as fast as possible.
