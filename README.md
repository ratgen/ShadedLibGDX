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
**Remember** to delete any trace of Jan's repository in with `settings.xml`, the `pom.xml` in the root of the project and inside the Core module. You should still be authenticated to GitHub packages like [this](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry#authenticating-to-github-packages). You could also fork the repo to update it yourself.
Also change the versions of shadedlibgdx to the latest version of the dependency.
