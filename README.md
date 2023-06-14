# @numbersprotocol/preview-memory

Get the available memory of Android and iOS devices

## Install

```bash
npm install @numbersprotocol/preview-memory
npx cap sync
```

## API

<docgen-index>

* [`echo(...)`](#echo)
* [`getAvailableMemory()`](#getavailablememory)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### echo(...)

```typescript
echo(options: { value: string; }) => Promise<{ value: string; }>
```

| Param         | Type                            |
| ------------- | ------------------------------- |
| **`options`** | <code>{ value: string; }</code> |

**Returns:** <code>Promise&lt;{ value: string; }&gt;</code>

--------------------


### getAvailableMemory()

```typescript
getAvailableMemory() => Promise<{ value: number; }>
```

**Returns:** <code>Promise&lt;{ value: number; }&gt;</code>

--------------------

</docgen-api>
