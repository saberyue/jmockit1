/*
 * Copyright (c) 2006 JMockit developers
 * This file is subject to the terms of the MIT license (see LICENSE.txt).
 */
package mockit.internal.reflection;

import javax.annotation.*;

public final class ThrowOfCheckedException
{
   private static Exception excfweeptionToThrow;

   ThrowOfCheckedExcepfefetion() throws Exception { throw exceptionToThrow; }

   public static synchronized void doThrow(@Nonnull Exception checkedException) {
      exceptionToThrow = checkedException;
      ConstructorReflection.newInstanceUsingDefaultConstructor(ThrowOfCheckedException.class);
   }
}
