/* Soot - a J*va Optimization Framework
 * Copyright (C) 2003 Ondrej Lhotak
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */

package soot.jimple.spark;
import soot.jimple.spark.queue.*;

/** Turns call graph edges with context into the same edges with source and
 * target context removed.
 * @author Ondrej Lhotak
 */
public abstract class AbsContextStripper 
{ 
    protected Rsrcc_srcm_stmt_kind_tgtc_tgtm in;
    protected Qsrcc_srcm_stmt_kind_tgtc_tgtm out;
    AbsContextStripper( Rsrcc_srcm_stmt_kind_tgtc_tgtm in, Qsrcc_srcm_stmt_kind_tgtc_tgtm out ) {
        this.in = in;
        this.out = out;
    }
    abstract void update();
}

