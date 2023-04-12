# ShadedLibGDX

To use this plugin, put this in your pom.xml file for your whole project, inside the `<profiles>` section.

```
<profile>
  <id>github</id>
  <repositories>
    <repository>
      <id>github</id>
      <url>https://maven.pkg.github.com/ratgen/*</url>
      <snapshots>
        <enabled>true</enabled>
      </snapshots>
    </repository>
  </repositories>
</profile>
```

Also changet the versions of shadedlibgdx to the latest version of the dependency.
