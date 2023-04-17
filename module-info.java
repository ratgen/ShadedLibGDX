module com.badlogic.gdx {
  requires java.desktop;
  requires jdk.unsupported;
  exports com.badlogic.gdx;
  exports com.badlogic.gdx.graphics;
  exports com.badlogic.gdx.graphics.g2d;
  exports com.badlogic.gdx.backends.lwjgl3;
  exports com.badlogic.gdx.graphics.glutils;
  exports com.badlogic.gdx.utils;
  exports com.badlogic.gdx.utils.viewport;
  exports com.badlogic.gdx.assets;
  exports com.badlogic.gdx.assets.loaders;
  exports com.badlogic.gdx.assets.loaders.resolvers;
  exports com.badlogic.gdx.maps;
  exports com.badlogic.gdx.maps.tiled;
  exports com.badlogic.gdx.maps.tiled.tiles;
  exports com.badlogic.gdx.scenes.scene2d;
  exports com.badlogic.gdx.scenes.scene2d.ui;
}
