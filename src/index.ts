import { registerPlugin } from '@capacitor/core';

import type { PreviewMemoryPlugin } from './definitions';

const PreviewMemory = registerPlugin<PreviewMemoryPlugin>('PreviewMemory', {
  web: () => import('./web').then(m => new m.PreviewMemoryWeb()),
});

export * from './definitions';
export { PreviewMemory };
