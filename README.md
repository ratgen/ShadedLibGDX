# ShadedLibGDX

To use this plugin, put this in your pom.xml file for your whole project, inside the `<profiles>` section. **Remember** to delete any trace of Jan's library in with `settings.xml`, the `pom.xml` in the root of the project and inside the Core module. You could also fork the repo to update it yourself.

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

Also change the versions of shadedlibgdx to the latest version of the dependency.
