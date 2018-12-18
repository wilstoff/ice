// **********************************************************************
//
// Copyright (c) 2003-present ZeroC, Inc. All rights reserved.
//
// **********************************************************************

#pragma once

[["ice-prefix", "cpp:header-ext:h", "cpp:dll-export:ICE_API", "cpp:doxygen:include:Ice/Ice.h", "objc:header-dir:objc", "objc:dll-export:ICE_API", "python:pkgdir:Ice", "js:module:ice"]]

#ifndef __SLICE2JAVA_COMPAT__
[["java:package:com.zeroc"]]
#endif

["objc:prefix:ICE"]
module Ice
{

/** A sequence of bools. **/
sequence<bool> BoolSeq;

/** A sequence of bytes. **/
sequence<byte> ByteSeq;

/** A sequence of shorts. **/
sequence<short> ShortSeq;

/** A sequence of ints. **/
sequence<int> IntSeq;

/** A sequence of longs. **/
sequence<long> LongSeq;

/** A sequence of floats. **/
sequence<float> FloatSeq;

/** A sequence of doubles. **/
sequence<double> DoubleSeq;

/** A sequence of strings. **/
sequence<string> StringSeq;

/** A sequence of objects. **/
sequence<Object> ObjectSeq;

/** A sequence of object proxies. **/
sequence<Object*> ObjectProxySeq;

}
