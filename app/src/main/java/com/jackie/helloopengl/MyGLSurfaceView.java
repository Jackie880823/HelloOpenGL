package com.jackie.helloopengl;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by on 16/5/6.
 *
 * @author Jackie Zhu
 * @version 1.0
 */
public class MyGLSurfaceView extends GLSurfaceView {

    private final MyGLRenderer mRenderer;

    public MyGLSurfaceView(Context context) {
        super(context);

        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2);

        mRenderer = new MyGLRenderer();

        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);

        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(mRenderer);
    }
}
