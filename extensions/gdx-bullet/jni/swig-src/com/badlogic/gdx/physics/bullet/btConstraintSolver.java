/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btConstraintSolver {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btConstraintSolver(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btConstraintSolver obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btConstraintSolver(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void prepareSolve(int arg0, int arg1) {
    gdxBulletJNI.btConstraintSolver_prepareSolve(swigCPtr, this, arg0, arg1);
  }

  public float solveGroup(SWIGTYPE_p_p_btCollisionObject bodies, int numBodies, SWIGTYPE_p_p_btPersistentManifold manifold, int numManifolds, SWIGTYPE_p_p_btTypedConstraint constraints, int numConstraints, btContactSolverInfo info, btIDebugDraw debugDrawer, btStackAlloc stackAlloc, btDispatcher dispatcher) {
    return gdxBulletJNI.btConstraintSolver_solveGroup(swigCPtr, this, SWIGTYPE_p_p_btCollisionObject.getCPtr(bodies), numBodies, SWIGTYPE_p_p_btPersistentManifold.getCPtr(manifold), numManifolds, SWIGTYPE_p_p_btTypedConstraint.getCPtr(constraints), numConstraints, btContactSolverInfo.getCPtr(info), info, btIDebugDraw.getCPtr(debugDrawer), debugDrawer, btStackAlloc.getCPtr(stackAlloc), stackAlloc, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public void allSolved(btContactSolverInfo arg0, btIDebugDraw arg1, btStackAlloc arg2) {
    gdxBulletJNI.btConstraintSolver_allSolved(swigCPtr, this, btContactSolverInfo.getCPtr(arg0), arg0, btIDebugDraw.getCPtr(arg1), arg1, btStackAlloc.getCPtr(arg2), arg2);
  }

  public void reset() {
    gdxBulletJNI.btConstraintSolver_reset(swigCPtr, this);
  }

}
