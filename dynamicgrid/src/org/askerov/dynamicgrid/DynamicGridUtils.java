package org.askerov.dynamicgrid;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: alex askerov
 * Date: 9/7/13
 * Time: 10:14 PM
 */
public class DynamicGridUtils {
    /**
     * Delete item in <code>list</code> from position <code>indexFrom</code> and insert it to <code>indexTwo</code>
     *
     * @param list
     * @param indexFrom
     * @param indexTwo
     */
    public static <T> void reorder(List<T> list, int indexFrom, int indexTwo) {
        T item = list.remove(indexFrom);
        list.add(indexTwo, item);
    }

    /**
     * Swap item in <code>list</code> at position <code>firstIndex</code> with item at position <code>secondIndex</code>
     *
     * @param list The list in which to swap the items.
     * @param firstIndex The position of the first item in the list.
     * @param secondIndex The position of the second item in the list.
     */
    public static <T> void swap(List<T> list, int firstIndex, int secondIndex) {
        T firstItem = list.get(firstIndex);
        T secondItem = list.get(secondIndex);
        list.set(firstIndex, secondItem);
        list.set(secondIndex, firstItem);
    }

    public static float getViewX(View view) {
        return Math.abs((view.getRight() - view.getLeft()) / 2);
    }

    public static float getViewY(View view) {
        return Math.abs((view.getBottom() - view.getTop()) / 2);
    }
}
