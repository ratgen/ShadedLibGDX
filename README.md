# ShadedLibGDX

To add to your project, add this in your profile section in your `pom.xml` file in your root project:

```
<profile>
  <id>github</id>
  <repositories>
    <repository>
     <id>github</id>
      <url>https://maven.pkg.github.com/ratgen/*</url>
    </repository>
  </repositories>
</profile>
```

You should still be authenticated to GitHub packages like [this](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry#authenticating-to-github-packages). You could also fork the repo to update it yourself. Also change the versions of shadedlibgdx to the latest version of the dependency.
