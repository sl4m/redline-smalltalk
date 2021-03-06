/* Redline Smalltalk, Copyright (c) James C. Ladd. All rights reserved. See LICENSE in the root of this distribution */
package st.redline.stout;

public interface RouterFactory {
    Router create(String requestPathSpec, String type, Block block);
}
