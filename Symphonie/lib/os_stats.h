/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

#ifdef NATIVE_STATS
int OS_nativeFunctionCallCount[];
char* OS_nativeFunctionNames[];
#define OS_NATIVE_ENTER(env, that, func) OS_nativeFunctionCallCount[func]++;
#define OS_NATIVE_EXIT(env, that, func) 
#else
#define OS_NATIVE_ENTER(env, that, func) 
#define OS_NATIVE_EXIT(env, that, func) 
#endif

#define CODESET_FUNC 0
#define Call_FUNC 1
#define ConnectionNumber_FUNC 2
#define FD_1ISSET_FUNC 3
#define FD_1SET_FUNC 4
#define FD_1ZERO_FUNC 5
#define LC_1CTYPE_FUNC 6
#define MB_1CUR_1MAX_FUNC 7
#define XAllocColor_FUNC 8
#define XBell_FUNC 9
#define XBlackPixel_FUNC 10
#define XChangeActivePointerGrab_FUNC 11
#define XChangeProperty_FUNC 12
#define XChangeWindowAttributes_FUNC 13
#define XCheckIfEvent_FUNC 14
#define XCheckMaskEvent_FUNC 15
#define XCheckWindowEvent_FUNC 16
#define XClearArea_FUNC 17
#define XClipBox_FUNC 18
#define XCloseDisplay_FUNC 19
#define XCopyArea_FUNC 20
#define XCopyPlane_FUNC 21
#define XCreateBitmapFromData_FUNC 22
#define XCreateFontCursor_FUNC 23
#define XCreateGC_FUNC 24
#define XCreateImage_FUNC 25
#define XCreatePixmap_FUNC 26
#define XCreatePixmapCursor_FUNC 27
#define XCreateRegion_FUNC 28
#define XCreateWindow_FUNC 29
#define XDefaultColormap_FUNC 30
#define XDefaultColormapOfScreen_FUNC 31
#define XDefaultDepthOfScreen_FUNC 32
#define XDefaultGCOfScreen_FUNC 33
#define XDefaultRootWindow_FUNC 34
#define XDefaultScreen_FUNC 35
#define XDefaultScreenOfDisplay_FUNC 36
#define XDefaultVisual_FUNC 37
#define XDefineCursor_FUNC 38
#define XDestroyImage_FUNC 39
#define XDestroyRegion_FUNC 40
#define XDestroyWindow_FUNC 41
#define XDisplayHeight_FUNC 42
#define XDisplayHeightMM_FUNC 43
#define XDisplayWidth_FUNC 44
#define XDisplayWidthMM_FUNC 45
#define XDrawArc_FUNC 46
#define XDrawLine_FUNC 47
#define XDrawLines_FUNC 48
#define XDrawPoint_FUNC 49
#define XDrawRectangle_FUNC 50
#define XEmptyRegion_FUNC 51
#define XEventsQueued_FUNC 52
#define XFillArc_FUNC 53
#define XFillPolygon_FUNC 54
#define XFillRectangle_FUNC 55
#define XFilterEvent_FUNC 56
#define XFlush_FUNC 57
#define XFontsOfFontSet_FUNC 58
#define XFree_FUNC 59
#define XFreeColors_FUNC 60
#define XFreeCursor_FUNC 61
#define XFreeFont_FUNC 62
#define XFreeFontNames_FUNC 63
#define XFreeGC_FUNC 64
#define XFreePixmap_FUNC 65
#define XFreeStringList_FUNC 66
#define XGetGCValues_FUNC 67
#define XGetGeometry_FUNC 68
#define XGetIconSizes_FUNC 69
#define XGetImage_FUNC 70
#define XGetInputFocus_FUNC 71
#define XGetModifierMapping_FUNC 72
#define XGetWindowAttributes_FUNC 73
#define XGetWindowProperty_FUNC 74
#define XGrabKeyboard_FUNC 75
#define XGrabPointer_FUNC 76
#define XInitThreads_FUNC 77
#define XInternAtom_FUNC 78
#define XIntersectRegion_FUNC 79
#define XKeysymToKeycode_FUNC 80
#define XKeysymToString_FUNC 81
#define XListFonts_FUNC 82
#define XListProperties_FUNC 83
#define XLocaleOfFontSet_FUNC 84
#define XLookupString_FUNC 85
#define XLowerWindow_FUNC 86
#define XMapWindow_FUNC 87
#define XMoveResizeWindow_FUNC 88
#define XOpenDisplay_FUNC 89
#define XPointInRegion_FUNC 90
#define XPolygonRegion_FUNC 91
#define XPutImage_FUNC 92
#define XQueryBestCursor_FUNC 93
#define XQueryColor_FUNC 94
#define XQueryPointer_FUNC 95
#define XQueryTree_FUNC 96
#define XRaiseWindow_FUNC 97
#define XReconfigureWMWindow_FUNC 98
#define XRectInRegion_FUNC 99
#define XReparentWindow_FUNC 100
#define XResizeWindow_FUNC 101
#define XRootWindowOfScreen_FUNC 102
#define XSelectInput_FUNC 103
#define XSendEvent_FUNC 104
#define XSetBackground_FUNC 105
#define XSetClipMask_FUNC 106
#define XSetClipRectangles_FUNC 107
#define XSetDashes_FUNC 108
#define XSetErrorHandler_FUNC 109
#define XSetFillStyle_FUNC 110
#define XSetForeground_FUNC 111
#define XSetFunction_FUNC 112
#define XSetGraphicsExposures_FUNC 113
#define XSetIOErrorHandler_FUNC 114
#define XSetInputFocus_FUNC 115
#define XSetLineAttributes_FUNC 116
#define XSetRegion_FUNC 117
#define XSetStipple_FUNC 118
#define XSetSubwindowMode_FUNC 119
#define XSetWMNormalHints_FUNC 120
#define XShapeCombineMask_FUNC 121
#define XShapeCombineRegion_FUNC 122
#define XSubtractRegion_FUNC 123
#define XSync_FUNC 124
#define XSynchronize_FUNC 125
#define XTestFakeButtonEvent_FUNC 126
#define XTestFakeKeyEvent_FUNC 127
#define XTestFakeMotionEvent_FUNC 128
#define XUndefineCursor_FUNC 129
#define XUngrabKeyboard_FUNC 130
#define XUngrabPointer_FUNC 131
#define XUnionRectWithRegion_FUNC 132
#define XUnionRegion_FUNC 133
#define XUnmapWindow_FUNC 134
#define XWarpPointer_FUNC 135
#define XWhitePixel_FUNC 136
#define XWithdrawWindow_FUNC 137
#define XineramaIsActive_FUNC 138
#define XineramaQueryScreens_FUNC 139
#define XmAddWMProtocolCallback_FUNC 140
#define XmChangeColor_FUNC 141
#define XmClipboardCopy_FUNC 142
#define XmClipboardEndCopy_FUNC 143
#define XmClipboardEndRetrieve_FUNC 144
#define XmClipboardInquireCount_FUNC 145
#define XmClipboardInquireFormat_FUNC 146
#define XmClipboardInquireLength_FUNC 147
#define XmClipboardRetrieve_FUNC 148
#define XmClipboardStartCopy_FUNC 149
#define XmClipboardStartRetrieve_FUNC 150
#define XmComboBoxAddItem_FUNC 151
#define XmComboBoxDeletePos_FUNC 152
#define XmComboBoxSelectItem_FUNC 153
#define XmCreateArrowButton_FUNC 154
#define XmCreateCascadeButtonGadget_FUNC 155
#define XmCreateComboBox_FUNC 156
#define XmCreateDialogShell_FUNC 157
#define XmCreateDrawingArea_FUNC 158
#define XmCreateDrawnButton_FUNC 159
#define XmCreateErrorDialog_FUNC 160
#define XmCreateFileSelectionDialog_FUNC 161
#define XmCreateForm_FUNC 162
#define XmCreateFrame_FUNC 163
#define XmCreateInformationDialog_FUNC 164
#define XmCreateLabel_FUNC 165
#define XmCreateList_FUNC 166
#define XmCreateMainWindow_FUNC 167
#define XmCreateMenuBar_FUNC 168
#define XmCreateMessageDialog_FUNC 169
#define XmCreatePopupMenu_FUNC 170
#define XmCreatePulldownMenu_FUNC 171
#define XmCreatePushButton_FUNC 172
#define XmCreatePushButtonGadget_FUNC 173
#define XmCreateQuestionDialog_FUNC 174
#define XmCreateScale_FUNC 175
#define XmCreateScrollBar_FUNC 176
#define XmCreateScrolledList_FUNC 177
#define XmCreateScrolledText_FUNC 178
#define XmCreateSeparator_FUNC 179
#define XmCreateSeparatorGadget_FUNC 180
#define XmCreateTextField_FUNC 181
#define XmCreateToggleButton_FUNC 182
#define XmCreateToggleButtonGadget_FUNC 183
#define XmCreateWarningDialog_FUNC 184
#define XmCreateWorkingDialog_FUNC 185
#define XmDestroyPixmap_FUNC 186
#define XmDragCancel_FUNC 187
#define XmDragStart_FUNC 188
#define XmDropSiteRegister_FUNC 189
#define XmDropSiteUnregister_FUNC 190
#define XmDropSiteUpdate_FUNC 191
#define XmDropTransferAdd_FUNC 192
#define XmDropTransferStart_FUNC 193
#define XmFileSelectionBoxGetChild_FUNC 194
#define XmFontListAppendEntry_FUNC 195
#define XmFontListCopy_FUNC 196
#define XmFontListEntryFree_FUNC 197
#define XmFontListEntryGetFont_FUNC 198
#define XmFontListEntryLoad_FUNC 199
#define XmFontListFree_FUNC 200
#define XmFontListFreeFontContext_FUNC 201
#define XmFontListInitFontContext_FUNC 202
#define XmFontListNextEntry_FUNC 203
#define XmGetAtomName_FUNC 204
#define XmGetDragContext_FUNC 205
#define XmGetFocusWidget_FUNC 206
#define XmGetPixmap_FUNC 207
#define XmGetPixmapByDepth_FUNC 208
#define XmGetXmDisplay_FUNC 209
#define XmImMbLookupString_FUNC 210
#define XmImRegister_FUNC 211
#define XmImSetFocusValues_FUNC 212
#define XmImSetValues_FUNC 213
#define XmImUnregister_FUNC 214
#define XmImUnsetFocus_FUNC 215
#define XmInternAtom_FUNC 216
#define XmListAddItemUnselected_FUNC 217
#define XmListDeleteAllItems_FUNC 218
#define XmListDeleteItemsPos_FUNC 219
#define XmListDeletePos_FUNC 220
#define XmListDeletePositions_FUNC 221
#define XmListDeselectAllItems_FUNC 222
#define XmListDeselectPos_FUNC 223
#define XmListGetKbdItemPos_FUNC 224
#define XmListGetSelectedPos_FUNC 225
#define XmListItemPos_FUNC 226
#define XmListPosSelected_FUNC 227
#define XmListReplaceItemsPosUnselected_FUNC 228
#define XmListSelectPos_FUNC 229
#define XmListSetKbdItemPos_FUNC 230
#define XmListSetPos_FUNC 231
#define XmListUpdateSelectedList_FUNC 232
#define XmMainWindowSetAreas_FUNC 233
#define XmMessageBoxGetChild_FUNC 234
#define XmParseMappingCreate_FUNC 235
#define XmParseMappingFree_FUNC 236
#define XmProcessTraversal_FUNC 237
#define XmRenderTableAddRenditions_FUNC 238
#define XmRenderTableFree_FUNC 239
#define XmRenditionCreate_FUNC 240
#define XmRenditionFree_FUNC 241
#define XmStringBaseline_FUNC 242
#define XmStringCompare_FUNC 243
#define XmStringComponentCreate_FUNC 244
#define XmStringConcat_FUNC 245
#define XmStringCreate_FUNC 246
#define XmStringCreateLocalized_FUNC 247
#define XmStringDraw_FUNC 248
#define XmStringDrawImage_FUNC 249
#define XmStringDrawUnderline_FUNC 250
#define XmStringEmpty_FUNC 251
#define XmStringExtent_FUNC 252
#define XmStringFree_FUNC 253
#define XmStringGenerate_FUNC 254
#define XmStringHeight_FUNC 255
#define XmStringParseText_FUNC 256
#define XmStringUnparse_FUNC 257
#define XmStringWidth_FUNC 258
#define XmTabCreate_FUNC 259
#define XmTabFree_FUNC 260
#define XmTabListFree_FUNC 261
#define XmTabListInsertTabs_FUNC 262
#define XmTextClearSelection_FUNC 263
#define XmTextCopy_FUNC 264
#define XmTextCut_FUNC 265
#define XmTextDisableRedisplay_FUNC 266
#define XmTextEnableRedisplay_FUNC 267
#define XmTextFieldPaste_FUNC 268
#define XmTextGetInsertionPosition_FUNC 269
#define XmTextGetLastPosition_FUNC 270
#define XmTextGetMaxLength_FUNC 271
#define XmTextGetSelection_FUNC 272
#define XmTextGetSelectionPosition_FUNC 273
#define XmTextGetString_FUNC 274
#define XmTextGetSubstring_FUNC 275
#define XmTextGetSubstringWcs_FUNC 276
#define XmTextInsert_FUNC 277
#define XmTextPaste_FUNC 278
#define XmTextPosToXY_FUNC 279
#define XmTextReplace_FUNC 280
#define XmTextScroll_FUNC 281
#define XmTextSetEditable_FUNC 282
#define XmTextSetHighlight_FUNC 283
#define XmTextSetInsertionPosition_FUNC 284
#define XmTextSetMaxLength_FUNC 285
#define XmTextSetSelection_FUNC 286
#define XmTextSetString_FUNC 287
#define XmTextShowPosition_FUNC 288
#define XmUpdateDisplay_FUNC 289
#define XmWidgetGetDisplayRect_FUNC 290
#define XmbTextListToTextProperty_FUNC 291
#define XmbTextPropertyToTextList_FUNC 292
#define XpCancelJob_FUNC 293
#define XpCreateContext_FUNC 294
#define XpDestroyContext_FUNC 295
#define XpEndJob_FUNC 296
#define XpEndPage_FUNC 297
#define XpFreePrinterList_FUNC 298
#define XpGetOneAttribute_FUNC 299
#define XpGetPageDimensions_FUNC 300
#define XpGetPrinterList_FUNC 301
#define XpGetScreenOfContext_FUNC 302
#define XpSetAttributes_FUNC 303
#define XpSetContext_FUNC 304
#define XpStartJob_FUNC 305
#define XpStartPage_FUNC 306
#define XtAddCallback_FUNC 307
#define XtAddEventHandler_FUNC 308
#define XtAddExposureToRegion_FUNC 309
#define XtAppAddInput_FUNC 310
#define XtAppAddTimeOut_FUNC 311
#define XtAppCreateShell_FUNC 312
#define XtAppGetSelectionTimeout_FUNC 313
#define XtAppNextEvent_FUNC 314
#define XtAppPeekEvent_FUNC 315
#define XtAppPending_FUNC 316
#define XtAppProcessEvent_FUNC 317
#define XtAppSetErrorHandler_FUNC 318
#define XtAppSetFallbackResources_FUNC 319
#define XtAppSetSelectionTimeout_FUNC 320
#define XtAppSetWarningHandler_FUNC 321
#define XtBuildEventMask_FUNC 322
#define XtCallActionProc_FUNC 323
#define XtClass_FUNC 324
#define XtConfigureWidget_FUNC 325
#define XtCreateApplicationContext_FUNC 326
#define XtCreatePopupShell_FUNC 327
#define XtDestroyApplicationContext_FUNC 328
#define XtDestroyWidget_FUNC 329
#define XtDispatchEvent_FUNC 330
#define XtDisplay_FUNC 331
#define XtDisplayToApplicationContext_FUNC 332
#define XtFree_FUNC 333
#define XtGetMultiClickTime_FUNC 334
#define XtGetValues_FUNC 335
#define XtInsertEventHandler_FUNC 336
#define XtIsManaged_FUNC 337
#define XtIsRealized_FUNC 338
#define XtIsSubclass_FUNC 339
#define XtIsTopLevelShell_FUNC 340
#define XtLastTimestampProcessed_FUNC 341
#define XtMalloc_FUNC 342
#define XtManageChild_FUNC 343
#define XtMapWidget_FUNC 344
#define XtMoveWidget_FUNC 345
#define XtNameToWidget_FUNC 346
#define XtOpenDisplay_FUNC 347
#define XtOverrideTranslations_FUNC 348
#define XtParent_FUNC 349
#define XtParseTranslationTable_FUNC 350
#define XtPopdown_FUNC 351
#define XtPopup_FUNC 352
#define XtQueryGeometry_FUNC 353
#define XtRealizeWidget_FUNC 354
#define XtRegisterDrawable_FUNC 355
#define XtRemoveEventHandler_FUNC 356
#define XtRemoveInput_FUNC 357
#define XtRemoveTimeOut_FUNC 358
#define XtResizeWidget_FUNC 359
#define XtResizeWindow_FUNC 360
#define XtSetLanguageProc_FUNC 361
#define XtSetMappedWhenManaged_FUNC 362
#define XtSetValues_FUNC 363
#define XtToolkitInitialize_FUNC 364
#define XtToolkitThreadInitialize_FUNC 365
#define XtTranslateCoords_FUNC 366
#define XtUnmanageChild_FUNC 367
#define XtUnmapWidget_FUNC 368
#define XtUnregisterDrawable_FUNC 369
#define XtWindow_FUNC 370
#define XtWindowToWidget_FUNC 371
#define _1XmSetMenuTraversal_FUNC 372
#define close_FUNC 373
#define fd_1set_1sizeof_FUNC 374
#define getenv_FUNC 375
#define iconv_FUNC 376
#define iconv_1close_FUNC 377
#define iconv_1open_FUNC 378
#define memmove__ILorg_eclipse_swt_internal_motif_XButtonEvent_2I_FUNC 379
#define memmove__ILorg_eclipse_swt_internal_motif_XClientMessageEvent_2I_FUNC 380
#define memmove__ILorg_eclipse_swt_internal_motif_XConfigureEvent_2I_FUNC 381
#define memmove__ILorg_eclipse_swt_internal_motif_XExposeEvent_2I_FUNC 382
#define memmove__ILorg_eclipse_swt_internal_motif_XImage_2I_FUNC 383
#define memmove__ILorg_eclipse_swt_internal_motif_XKeyEvent_2I_FUNC 384
#define memmove__ILorg_eclipse_swt_internal_motif_XmDragProcCallbackStruct_2I_FUNC 385
#define memmove__ILorg_eclipse_swt_internal_motif_XmTextBlockRec_2I_FUNC 386
#define memmove__ILorg_eclipse_swt_internal_motif_XmTextVerifyCallbackStruct_2I_FUNC 387
#define memmove__I_3BI_FUNC 388
#define memmove__I_3CI_FUNC 389
#define memmove__I_3II_FUNC 390
#define memmove__I_3SI_FUNC 391
#define memmove__Lorg_eclipse_swt_internal_motif_Visual_2II_FUNC 392
#define memmove__Lorg_eclipse_swt_internal_motif_XButtonEvent_2II_FUNC 393
#define memmove__Lorg_eclipse_swt_internal_motif_XCharStruct_2II_FUNC 394
#define memmove__Lorg_eclipse_swt_internal_motif_XClientMessageEvent_2II_FUNC 395
#define memmove__Lorg_eclipse_swt_internal_motif_XConfigureEvent_2II_FUNC 396
#define memmove__Lorg_eclipse_swt_internal_motif_XCreateWindowEvent_2II_FUNC 397
#define memmove__Lorg_eclipse_swt_internal_motif_XCrossingEvent_2II_FUNC 398
#define memmove__Lorg_eclipse_swt_internal_motif_XDestroyWindowEvent_2II_FUNC 399
#define memmove__Lorg_eclipse_swt_internal_motif_XEvent_2II_FUNC 400
#define memmove__Lorg_eclipse_swt_internal_motif_XExposeEvent_2II_FUNC 401
#define memmove__Lorg_eclipse_swt_internal_motif_XFocusChangeEvent_2II_FUNC 402
#define memmove__Lorg_eclipse_swt_internal_motif_XFontStruct_2II_FUNC 403
#define memmove__Lorg_eclipse_swt_internal_motif_XIconSize_2II_FUNC 404
#define memmove__Lorg_eclipse_swt_internal_motif_XImage_2II_FUNC 405
#define memmove__Lorg_eclipse_swt_internal_motif_XKeyEvent_2II_FUNC 406
#define memmove__Lorg_eclipse_swt_internal_motif_XModifierKeymap_2II_FUNC 407
#define memmove__Lorg_eclipse_swt_internal_motif_XMotionEvent_2II_FUNC 408
#define memmove__Lorg_eclipse_swt_internal_motif_XPropertyEvent_2II_FUNC 409
#define memmove__Lorg_eclipse_swt_internal_motif_XReparentEvent_2II_FUNC 410
#define memmove__Lorg_eclipse_swt_internal_motif_XineramaScreenInfo_2II_FUNC 411
#define memmove__Lorg_eclipse_swt_internal_motif_XmAnyCallbackStruct_2II_FUNC 412
#define memmove__Lorg_eclipse_swt_internal_motif_XmDragProcCallbackStruct_2II_FUNC 413
#define memmove__Lorg_eclipse_swt_internal_motif_XmDropFinishCallbackStruct_2II_FUNC 414
#define memmove__Lorg_eclipse_swt_internal_motif_XmDropProcCallbackStruct_2II_FUNC 415
#define memmove__Lorg_eclipse_swt_internal_motif_XmTextBlockRec_2II_FUNC 416
#define memmove__Lorg_eclipse_swt_internal_motif_XmTextVerifyCallbackStruct_2II_FUNC 417
#define memmove___3BII_FUNC 418
#define memmove___3CII_FUNC 419
#define memmove___3III_FUNC 420
#define nl_1langinfo_FUNC 421
#define overrideShellWidgetClass_FUNC 422
#define pipe_FUNC 423
#define read_FUNC 424
#define select_FUNC 425
#define setResourceMem_FUNC 426
#define setlocale_FUNC 427
#define shellWidgetClass_FUNC 428
#define strlen_FUNC 429
#define topLevelShellWidgetClass_FUNC 430
#define transientShellWidgetClass_FUNC 431
#define write_FUNC 432
#define xmMenuShellWidgetClass_FUNC 433