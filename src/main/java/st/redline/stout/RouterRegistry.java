/* Redline Smalltalk, Copyright (c) James C. Ladd. All rights reserved. See LICENSE in the root of this distribution */
package st.redline.stout;

public interface RouterRegistry {
    Router register(String spec, String type, String method, Block block);
    Router lookup(String path, String method);
}
